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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QuizKt {
    private static ImageVector _quiz;

    public static final ImageVector getQuiz(Icons.Sharp sharp) {
        ImageVector imageVector = _quiz;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Quiz", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.0f, 6.0f, -2.0f, 0.0f);
        e.lineToRelative(0.0f, 16.0f);
        e.lineToRelative(16.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, -2.0f, -14.0f, 0.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(6.0f, 2.0f, 16.0f, 16.0f, 2.0f);
        k4.w(w, 6.0f, 13.51f, 10.16f);
        w.curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f);
        w.curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f);
        w.curveToRelative(-0.88f, 0.0f, -1.32f, 0.67f, -1.5f, 1.23f);
        w.lineToRelative(-1.37f, -0.57f);
        w.curveTo(11.51f, 5.96f, 12.52f, 5.0f, 13.99f, 5.0f);
        w.curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f);
        w.curveToRelative(0.37f, 0.6f, 0.58f, 1.73f, 0.01f, 2.57f);
        w.curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f);
        w.curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f);
        w.horizontalLineToRelative(-1.52f);
        w.curveTo(13.26f, 11.41f, 13.19f, 10.74f, 13.51f, 10.16f);
        w.close();
        w.moveTo(12.95f, 13.95f);
        w.curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f);
        w.curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f);
        w.curveToRelative(0.0f, 0.58f, -0.44f, 1.05f, -1.04f, 1.05f);
        w.curveTo(13.42f, 15.0f, 12.95f, 14.53f, 12.95f, 13.95f);
        w.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, w.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _quiz = build;
        build.getClass();
        return build;
    }
}
