package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.ed0;
import defpackage.j50;
import defpackage.ky;
import defpackage.w01;
import defpackage.z4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OffsetKt {
    public static final Modifier absoluteOffset(Modifier modifier, ky kyVar) {
        return modifier.then(new OffsetPxElement(kyVar, false, new z4(kyVar, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 absoluteOffset$lambda$0(ky kyVar, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absoluteOffset");
        inspectorInfo.getProperties().set("offset", kyVar);
        return w01.a;
    }

    /* renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m719absoluteOffsetVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new OffsetElement(f, f2, false, new ed0(f, f2, 0), null));
    }

    /* renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m720absoluteOffsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        return m719absoluteOffsetVpY3zN4(modifier, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 absoluteOffset_VpY3zN4$lambda$0(float f, float f2, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absoluteOffset");
        j50.g(f, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", Dp.m7609boximpl(f2));
        return w01.a;
    }

    public static final Modifier offset(Modifier modifier, ky kyVar) {
        return modifier.then(new OffsetPxElement(kyVar, true, new z4(kyVar, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 offset$lambda$0(ky kyVar, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("offset");
        inspectorInfo.getProperties().set("offset", kyVar);
        return w01.a;
    }

    /* renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m721offsetVpY3zN4(Modifier modifier, float f, float f2) {
        return modifier.then(new OffsetElement(f, f2, true, new ed0(f, f2, 1), null));
    }

    /* renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m722offsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        return m721offsetVpY3zN4(modifier, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 offset_VpY3zN4$lambda$0(float f, float f2, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("offset");
        j50.g(f, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", Dp.m7609boximpl(f2));
        return w01.a;
    }
}
