SUMMARY = "Communicate with Modbus protocol devices via serial port or Ethernet"
HOMEPAGE = "https://libmodbus.org"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/stephane/libmodbus.git;protocol=https;branch=master"

# Modify these as desired
PV = "3.1.10+git"
SRCREV = "dde16d555621516989c9a991f2a36ba9078d9b17"

S = "${WORKDIR}/git"


# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

