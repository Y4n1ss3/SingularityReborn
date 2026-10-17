package androidx.compose.material3;

import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface WideNavigationRailState {
    Object collapse(hm hmVar);

    Object expand(hm hmVar);

    WideNavigationRailValue getCurrentValue();

    WideNavigationRailValue getTargetValue();

    boolean isAnimating();

    Object snapTo(WideNavigationRailValue wideNavigationRailValue, hm hmVar);

    Object toggle(hm hmVar);
}
