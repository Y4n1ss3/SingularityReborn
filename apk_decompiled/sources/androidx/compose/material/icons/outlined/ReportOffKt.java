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
import defpackage.af0;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Outlined outlined) {
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ReportOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(9.1f, 5.0f, 5.8f, 19.0f, 9.1f);
        p.verticalLineToRelative(5.8f);
        p.lineToRelative(-0.22f, 0.22f);
        p.lineToRelative(1.42f, 1.41f);
        p.lineToRelative(0.8f, -0.8f);
        p.verticalLineTo(8.27f);
        p.lineTo(15.73f, 3.0f);
        p.horizontalLineTo(8.27f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, -0.8f, 0.8f, 1.41f, 1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 16.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 9.33f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(0.33f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 1.58f);
        pathBuilder.lineTo(1.0f, 2.99f);
        pathBuilder.lineToRelative(3.64f, 3.64f);
        pathBuilder.lineTo(3.0f, 8.27f);
        uo.k(pathBuilder, 7.46f, 8.27f, 21.0f, 7.46f);
        pathBuilder.lineToRelative(1.64f, -1.64f);
        pathBuilder.lineTo(21.01f, 23.0f);
        gy.B(pathBuilder, 1.41f, -1.41f, 2.41f, 1.58f);
        pathBuilder.moveTo(14.9f, 19.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.lineTo(5.0f, 14.9f);
        pathBuilder.verticalLineTo(9.1f);
        pathBuilder.lineToRelative(1.05f, -1.05f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(pathBuilder, 9.9f, 9.9f, 14.9f, 19.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = build;
        build.getClass();
        return build;
    }
}
