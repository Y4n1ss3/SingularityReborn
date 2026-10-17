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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicOffKt {
    private static ImageVector _micOff;

    public static final ImageVector getMicOff(Icons.Outlined outlined) {
        ImageVector imageVector = _micOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.8f, 4.9f);
        b.curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f);
        b.reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f);
        b.lineToRelative(-0.01f, 3.91f);
        b.lineTo(15.0f, 10.6f);
        b.verticalLineTo(5.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        b.curveToRelative(-1.54f, 0.0f, -2.79f, 1.16f, -2.96f, 2.65f);
        uf.x(b, 1.76f, 1.76f, 4.9f);
        b.moveTo(19.0f, 11.0f);
        b.horizontalLineToRelative(-1.7f);
        b.curveToRelative(0.0f, 0.58f, -0.1f, 1.13f, -0.27f, 1.64f);
        b.lineToRelative(1.27f, 1.27f);
        b.curveToRelative(0.44f, -0.88f, 0.7f, -1.87f, 0.7f, -2.91f);
        k4.r(b, 4.41f, 2.86f, 3.0f, 4.27f);
        b.lineToRelative(6.0f, 6.0f);
        b.verticalLineTo(11.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.curveToRelative(0.23f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        b.lineToRelative(1.66f, 1.66f);
        b.curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
        b.curveToRelative(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        kf0.r(b, 21.0f, 2.0f, -3.28f);
        b.curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f);
        b.lineToRelative(4.2f, 4.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.41f, -1.41f, 4.41f, 2.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micOff = build;
        build.getClass();
        return build;
    }
}
