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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QuestionMarkKt {
    private static ImageVector _questionMark;

    public static final ImageVector getQuestionMark(Icons.Rounded rounded) {
        ImageVector imageVector = _questionMark;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.QuestionMark", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.92f, 7.54f);
        b.curveTo(7.12f, 7.2f, 6.78f, 6.21f, 7.26f, 5.49f);
        b.curveTo(8.23f, 4.05f, 9.85f, 3.0f, 11.99f, 3.0f);
        b.curveToRelative(2.35f, 0.0f, 3.96f, 1.07f, 4.78f, 2.41f);
        b.curveToRelative(0.7f, 1.15f, 1.11f, 3.3f, 0.03f, 4.9f);
        b.curveToRelative(-1.2f, 1.77f, -2.35f, 2.31f, -2.97f, 3.45f);
        b.curveToRelative(-0.15f, 0.27f, -0.24f, 0.49f, -0.3f, 0.94f);
        b.curveToRelative(-0.09f, 0.73f, -0.69f, 1.3f, -1.43f, 1.3f);
        b.curveToRelative(-0.87f, 0.0f, -1.58f, -0.75f, -1.48f, -1.62f);
        b.curveToRelative(0.06f, -0.51f, 0.18f, -1.04f, 0.46f, -1.54f);
        b.curveToRelative(0.77f, -1.39f, 2.25f, -2.21f, 3.11f, -3.44f);
        b.curveToRelative(0.91f, -1.29f, 0.4f, -3.7f, -2.18f, -3.7f);
        b.curveToRelative(-1.17f, 0.0f, -1.93f, 0.61f, -2.4f, 1.34f);
        b.curveTo(9.26f, 7.61f, 8.53f, 7.79f, 7.92f, 7.54f);
        b.close();
        b.moveTo(14.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 14.0f, 18.9f, 14.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _questionMark = build;
        build.getClass();
        return build;
    }
}
