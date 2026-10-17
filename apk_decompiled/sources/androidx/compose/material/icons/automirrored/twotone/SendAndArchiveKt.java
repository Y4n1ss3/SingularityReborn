package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendAndArchiveKt {
    private static ImageVector _sendAndArchive;

    public static final ImageVector getSendAndArchive(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _sendAndArchive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.SendAndArchive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(5.0f, 7.01f, 3.49f, 6.0f, 1.5f);
        n.lineToRelative(-6.0f, 1.5f);
        n.verticalLineToRelative(3.49f);
        n.lineToRelative(5.39f, -2.27f);
        n.lineToRelative(0.0f, 0.0f);
        n.curveToRelative(0.6f, -1.74f, 1.86f, -3.16f, 3.48f, -3.97f);
        n.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 5.0f, 7.01f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(11.0f, 12.0f, -6.0f, -1.5f, 7.01f);
        j.lineToRelative(8.87f, 3.73f);
        j.curveToRelative(0.94f, -0.47f, 2.0f, -0.75f, 3.13f, -0.75f);
        j.curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f);
        j.lineTo(3.0f, 4.0f);
        j.verticalLineToRelative(16.0f);
        j.lineToRelative(7.0f, -2.95f);
        j.curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f);
        j.curveToRelative(0.0f, -0.8f, 0.14f, -1.56f, 0.39f, -2.28f);
        j.lineTo(5.0f, 16.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.k(j, 13.5f, 11.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 12.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        k4.x(b, 17.0f, 20.0f, -3.0f, -3.0f);
        af0.v(b, 2.5f, -3.0f, 1.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(b, 20.0f, 17.0f, 20.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sendAndArchive = build;
        build.getClass();
        return build;
    }
}
