package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SyncLockKt {
    private static ImageVector _syncLock;

    public static final ImageVector getSyncLock(Icons.Sharp sharp) {
        ImageVector imageVector = _syncLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SyncLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(10.0f, 4.26f, 2.09f);
        h.curveTo(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f);
        h.curveToRelative(0.0f, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f);
        j50.B(h, 14.0f, 2.0f, 6.0f, 4.0f);
        h.verticalLineToRelative(-2.0f);
        h.horizontalLineToRelative(2.73f);
        h.curveTo(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f);
        h.curveTo(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f);
        r6.B(h, 20.0f, 4.0f, -6.0f, 6.0f);
        h.horizontalLineToRelative(2.0f);
        h.verticalLineTo(7.56f);
        h.curveToRelative(1.22f, 1.1f, 2.0f, 2.67f, 2.0f, 4.44f);
        h.horizontalLineToRelative(2.0f);
        h.curveToRelative(0.0f, -2.4f, -1.06f, -4.54f, -2.73f, -6.0f);
        bv.s(h, 20.0f, 4.0f, 20.0f, 17.0f);
        h.verticalLineToRelative(-1.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        h.verticalLineToRelative(1.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(3.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(4.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.verticalLineToRelative(-3.0f);
        h.curveTo(21.0f, 17.45f, 20.55f, 17.0f, 20.0f, 17.0f);
        r6.B(h, 19.0f, 17.0f, -2.0f, -1.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(h, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncLock = build;
        build.getClass();
        return build;
    }
}
