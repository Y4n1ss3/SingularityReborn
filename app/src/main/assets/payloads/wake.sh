#!/system/bin/sh
# desc: wake the display and turn Wi-Fi back on (runs first, every time)
#
# Everything in payloads/default/ runs before the payloads you pick, on every
# run, unless you pass --no-default. Keep it to things that should always
# happen: the headset is usually asleep with Wi-Fi off, because that is how the
# exploit lands most reliably, and neither is a state you want to be left in.

input keyevent KEYCODE_WAKEUP

svc wifi enable
