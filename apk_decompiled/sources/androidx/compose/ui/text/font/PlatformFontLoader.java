package androidx.compose.ui.text.font;

import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PlatformFontLoader {
    Object awaitLoad(Font font, hm hmVar);

    Object getCacheKey();

    Object loadBlocking(Font font);
}
