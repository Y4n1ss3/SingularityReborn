package androidx.compose.material.icons.rounded;

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

    public static final ImageVector getLockReset(Icons.Rounded rounded) {
        ImageVector imageVector = _lockReset;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LockReset", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.26f, 3.0f);
        b.curveTo(8.17f, 2.86f, 4.0f, 6.94f, 4.0f, 12.0f);
        b.horizontalLineTo(2.21f);
        b.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        b.lineToRelative(2.79f, 2.79f);
        b.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        b.lineToRelative(2.8f, -2.79f);
        b.curveTo(8.46f, 12.54f, 8.24f, 12.0f, 7.79f, 12.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(0.0f, -3.89f, 3.2f, -7.06f, 7.1f, -7.0f);
        b.curveToRelative(3.71f, 0.05f, 6.84f, 3.18f, 6.9f, 6.9f);
        b.curveToRelative(0.06f, 3.91f, -3.1f, 7.1f, -7.0f, 7.1f);
        b.curveToRelative(-1.59f, 0.0f, -3.05f, -0.53f, -4.23f, -1.43f);
        b.curveToRelative(-0.4f, -0.3f, -0.96f, -0.27f, -1.31f, 0.09f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.43f, 0.43f, -0.39f, 1.14f, 0.09f, 1.5f);
        b.curveTo(9.06f, 20.31f, 10.95f, 21.0f, 13.0f, 21.0f);
        b.curveToRelative(5.06f, 0.0f, 9.14f, -4.17f, 9.0f, -9.25f);
        b.curveTo(21.87f, 7.05f, 17.95f, 3.13f, 13.26f, 3.0f);
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
