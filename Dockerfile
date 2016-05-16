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
    git clone https://github.com/kbase/transform && \
    . /kb/dev_container/user-env.sh && \
    cd /kb/dev_container/modules/transform && make && make TARGET=/kb/deployment deploy && cd ../../..

# -----------------------------------------

COPY ./ /kb/module
RUN mkdir -p /kb/module/work

WORKDIR /kb/module

RUN make

ENTRYPOINT [ "./scripts/entrypoint.sh" ]

CMD [ ]
