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
import defpackage.c21;
import defpackage.gy;
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QuizKt {
    private static ImageVector _quiz;

    public static final ImageVector getQuiz(Icons.Outlined outlined) {
        ImageVector imageVector = _quiz;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Quiz", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(4.0f, 6.0f, 2.0f, 14.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.t(q, 14.0f, -2.0f, 4.0f, 6.0f);
        q.moveTo(20.0f, 2.0f);
        q.horizontalLineTo(8.0f);
        q.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        q.verticalLineToRelative(12.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q.horizontalLineToRelative(12.0f);
        q.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q.verticalLineTo(4.0f);
        q.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        c21.d(q, 20.0f, 16.0f, 8.0f, 4.0f);
        uo.r(q, 12.0f, 16.0f, 13.51f, 10.16f);
        q.curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f);
        q.curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f);
        q.curveToRelative(-0.88f, 0.0f, -1.32f, 0.67f, -1.5f, 1.23f);
        q.lineToRelative(-1.37f, -0.57f);
        q.curveTo(11.51f, 5.96f, 12.52f, 5.0f, 13.99f, 5.0f);
        q.curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f);
        q.curveToRelative(0.37f, 0.6f, 0.58f, 1.73f, 0.01f, 2.57f);
        q.curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f);
        q.curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f);
        q.horizontalLineToRelative(-1.52f);
        q.curveTo(13.26f, 11.41f, 13.19f, 10.74f, 13.51f, 10.16f);
        q.close();
        q.moveTo(12.95f, 13.95f);
        q.curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f);
        q.curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f);
        q.curveToRelative(0.0f, 0.58f, -0.44f, 1.05f, -1.04f, 1.05f);
        q.curveTo(13.42f, 15.0f, 12.95f, 14.53f, 12.95f, 13.95f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _quiz = build;
        build.getClass();
        return build;
    }
}
