package androidx.compose.material3.pulltorefresh;

import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PullToRefreshState {
    Object animateToHidden(hm hmVar);

    Object animateToThreshold(hm hmVar);

    float getDistanceFraction();

    boolean isAnimating();

    Object snapTo(float f, hm hmVar);
}
