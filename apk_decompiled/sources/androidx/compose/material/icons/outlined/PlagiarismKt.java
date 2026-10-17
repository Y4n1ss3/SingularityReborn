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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlagiarismKt {
    private static ImageVector _plagiarism;

    public static final ImageVector getPlagiarism(Icons.Outlined outlined) {
        ImageVector imageVector = _plagiarism;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Plagiarism", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.0f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        d.horizontalLineTo(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.k(d, 8.0f, 14.0f, 2.0f);
        d.moveTo(18.0f, 20.0f);
        fc.t(d, 6.0f, 20.0f, 4.0f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(d, 5.0f, 5.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.03f, 11.03f);
        b.curveToRelative(-1.37f, 1.37f, -1.37f, 3.58f, 0.0f, 4.95f);
        b.curveToRelative(1.12f, 1.12f, 2.8f, 1.31f, 4.13f, 0.59f);
        b.lineToRelative(1.88f, 1.88f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(-1.88f, -1.88f);
        b.curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f);
        b.curveTo(12.61f, 9.66f, 10.39f, 9.66f, 9.03f, 11.03f);
        b.close();
        b.moveTo(12.56f, 14.56f);
        b.curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0.0f);
        b.curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f);
        b.curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f);
        b.curveTo(13.15f, 13.03f, 13.15f, 13.97f, 12.56f, 14.56f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _plagiarism = build;
        build.getClass();
        return build;
    }
}
