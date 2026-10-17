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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CancelScheduleSendKt {
    private static ImageVector _cancelScheduleSend;

    public static final ImageVector getCancelScheduleSend(Icons.Outlined outlined) {
        ImageVector imageVector = _cancelScheduleSend;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CancelScheduleSend", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.5f, 9.0f);
        b.curveToRelative(-0.42f, 0.0f, -0.83f, 0.04f, -1.24f, 0.11f);
        b.lineTo(1.01f, 3.0f);
        b.lineTo(1.0f, 10.0f);
        b.lineToRelative(10.06f, 1.34f);
        b.curveToRelative(-0.42f, 0.44f, -0.78f, 0.93f, -1.09f, 1.46f);
        b.lineTo(1.0f, 14.0f);
        b.lineToRelative(0.01f, 7.0f);
        b.lineToRelative(8.07f, -3.46f);
        b.curveTo(9.59f, 21.19f, 12.71f, 24.0f, 16.5f, 24.0f);
        b.curveToRelative(4.14f, 0.0f, 7.5f, -3.36f, 7.5f, -7.5f);
        b.reflectiveCurveTo(20.64f, 9.0f, 16.5f, 9.0f);
        k4.x(b, 3.0f, 8.25f, 0.01f, -2.22f);
        gy.B(b, 7.51f, 3.22f, 3.0f, 8.25f);
        b.moveTo(9.1f, 15.36f);
        b.lineTo(3.0f, 17.97f);
        b.verticalLineToRelative(-2.22f);
        b.lineToRelative(6.17f, -0.82f);
        b.curveTo(9.14f, 15.07f, 9.12f, 15.21f, 9.1f, 15.36f);
        b.close();
        b.moveTo(16.5f, 22.0f);
        b.curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f);
        b.reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f);
        b.reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 19.53f, 22.0f, 16.5f, 22.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.27f, 14.03f, -1.77f, 1.76f);
        e.lineToRelative(-1.77f, -1.76f);
        e.lineToRelative(-0.7f, 0.7f);
        e.lineToRelative(1.76f, 1.77f);
        e.lineToRelative(-1.76f, 1.77f);
        e.lineToRelative(0.7f, 0.7f);
        e.lineToRelative(1.77f, -1.76f);
        e.lineToRelative(1.77f, 1.76f);
        e.lineToRelative(0.7f, -0.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.76f, -1.77f, 1.76f, -1.77f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cancelScheduleSend = build;
        build.getClass();
        return build;
    }
}
