package androidx.compose.material.icons.automirrored.rounded;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendAndArchiveKt {
    private static ImageVector _sendAndArchive;

    public static final ImageVector getSendAndArchive(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _sendAndArchive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.SendAndArchive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 12.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        k4.x(b, 19.15f, 17.85f, -1.79f, 1.79f);
        b.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        b.lineToRelative(-1.79f, -1.79f);
        b.curveTo(14.54f, 17.54f, 14.76f, 17.0f, 15.21f, 17.0f);
        b.horizontalLineToRelative(1.29f);
        b.verticalLineToRelative(-2.5f);
        b.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        b.verticalLineTo(17.0f);
        b.horizontalLineToRelative(1.29f);
        b.curveTo(19.24f, 17.0f, 19.46f, 17.54f, 19.15f, 17.85f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.0f, 10.0f);
        b2.curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f);
        b2.lineTo(3.0f, 4.0f);
        b2.verticalLineToRelative(6.0f);
        b2.lineToRelative(8.0f, 2.0f);
        b2.lineToRelative(-8.0f, 2.0f);
        b2.verticalLineToRelative(6.0f);
        b2.lineToRelative(7.0f, -2.95f);
        b2.curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f);
        b2.curveTo(10.0f, 13.13f, 13.13f, 10.0f, 17.0f, 10.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sendAndArchive = build;
        build.getClass();
        return build;
    }
}
