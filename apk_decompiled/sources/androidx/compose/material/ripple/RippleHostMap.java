package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RippleHostMap {
    private final Map<RippleHostKey, RippleHostView> indicationToHostMap = new LinkedHashMap();
    private final Map<RippleHostView, RippleHostKey> hostToIndicationMap = new LinkedHashMap();

    public final RippleHostView get(RippleHostKey rippleHostKey) {
        return this.indicationToHostMap.get(rippleHostKey);
    }

    public final void remove(RippleHostKey rippleHostKey) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(rippleHostKey);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(rippleHostKey);
    }

    public final void set(RippleHostKey rippleHostKey, RippleHostView rippleHostView) {
        this.indicationToHostMap.put(rippleHostKey, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, rippleHostKey);
    }

    public final RippleHostKey get(RippleHostView rippleHostView) {
        return this.hostToIndicationMap.get(rippleHostView);
    }
}
