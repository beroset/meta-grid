LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/dnp3/opendnp3.git;protocol=https;branch=release"

# Modify these as desired
PV = "1.0+git"
SRCREV = "c1dc7165a79cc08edbf4b55d2ff4162efb176f92"

S = "${WORKDIR}/git"

DEPENDS = "openssl"

inherit cmake

EXTRA_OECMAKE = "-DDNP3_TLS=ON -DDNP3_EXAMPLES=ON -DFETCHCONTENT_FULLY_DISCONNECTED=OFF"

do_configure[network]="1"
