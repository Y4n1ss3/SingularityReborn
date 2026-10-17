package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LockResetKt {
    private static ImageVector _lockReset;

    public static final ImageVector getLockReset(Icons.Outlined outlined) {
        ImageVector imageVector = _lockReset;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LockReset", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 3.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.curveToRelative(0.0f, 0.06f, 0.01f, 0.12f, 0.01f, 0.19f);
        b.lineToRelative(-1.84f, -1.84f);
        b.lineToRelative(-1.41f, 1.41f);
        b.lineTo(5.0f, 16.0f);
        b.lineToRelative(4.24f, -4.24f);
        b.lineToRelative(-1.41f, -1.41f);
        b.lineToRelative(-1.82f, 1.82f);
        b.curveTo(6.01f, 12.11f, 6.0f, 12.06f, 6.0f, 12.0f);
        b.curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        b.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f);
        b.curveToRelative(-1.9f, 0.0f, -3.62f, -0.76f, -4.88f, -1.99f);
        b.lineTo(6.7f, 18.42f);
        b.curveTo(8.32f, 20.01f, 10.55f, 21.0f, 13.0f, 21.0f);
        b.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        b.reflectiveCurveTo(17.97f, 3.0f, 13.0f, 3.0f);
        bv.v(b, 15.0f, 11.0f, -1.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveTo(16.0f, 11.45f, 15.55f, 11.0f, 15.0f, 11.0f);
        r6.B(b, 14.0f, 11.0f, -2.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lockReset = build;
        build.getClass();
        return build;
    }
}
