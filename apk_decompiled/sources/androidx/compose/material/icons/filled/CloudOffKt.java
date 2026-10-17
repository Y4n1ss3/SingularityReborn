package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CloudOffKt {
    private static ImageVector _cloudOff;

    public static final ImageVector getCloudOff(Icons.Filled filled) {
        ImageVector imageVector = _cloudOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CloudOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.35f, 10.04f);
        b.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-1.48f, 0.0f, -2.85f, 0.43f, -4.01f, 1.17f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(10.21f, 6.23f, 11.08f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        b.verticalLineToRelative(0.5f);
        b.horizontalLineTo(19.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        b.curveToRelative(0.0f, 1.13f, -0.64f, 2.11f, -1.56f, 2.62f);
        b.lineToRelative(1.45f, 1.45f);
        b.curveTo(23.16f, 18.16f, 24.0f, 16.68f, 24.0f, 15.0f);
        b.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        k4.x(b, 3.0f, 5.27f, 2.75f, 2.74f);
        b.curveTo(2.56f, 8.15f, 0.0f, 10.77f, 0.0f, 14.0f);
        b.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b.horizontalLineToRelative(11.73f);
        b.lineToRelative(2.0f, 2.0f);
        b.lineTo(21.0f, 20.73f);
        r6.C(b, 4.27f, 4.0f, 3.0f, 5.27f);
        b.moveTo(7.73f, 10.0f);
        b.lineToRelative(8.0f, 8.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(b, 1.73f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudOff = build;
        build.getClass();
        return build;
    }
}
