FROM kbase/kbase:sdkbase.latest
MAINTAINER KBase Developer
# -----------------------------------------

# Insert apt-get instructions here to install
# any required dependencies for your module.

# RUN apt-get update
RUN cpanm -i Config::IniFiles

# Build transform
RUN cd /kb/dev_container/modules && \
    rm -rf transform && \
    rm -rf kb_model_seed && \
    rm -rf communities_api && \
    rm -rf KBaseFBAModeling && \
    rm -rf ModelSEED && \
    git clone https://github.com/danielolson5/transform && \
    cd transform && \
    git checkout develop && \
    . /kb/dev_container/user-env.sh && \
    cd /kb/dev_container/modules/transform && make && make TARGET=/kb/deployment deploy && cd ../../..

# Get NCBI SRATools (for fastq-dump)
RUN cd /kb/dev_container/modules && \
    mkdir NCBI_SRA_tools && cd NCBI_SRA_tools && \
    curl 'http://ftp-trace.ncbi.nlm.nih.gov/sra/sdk/2.7.0/sratoolkit.2.7.0-ubuntu64.tar.gz' -O && \
    tar zxf sratoolkit.2.7.0-ubuntu64.tar.gz && \
    cp sratoolkit.2.7.0-ubuntu64/bin/fastq-dump.2.7.0  /kb/deployment/bin/fastq-dump


# -----------------------------------------

COPY ./ /kb/module
RUN mkdir -p /kb/module/work
RUN chmod 777 /kb/module

WORKDIR /kb/module

RUN make all

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
