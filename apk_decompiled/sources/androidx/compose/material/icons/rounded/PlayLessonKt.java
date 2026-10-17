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
import defpackage.af0;
import defpackage.bv;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlayLessonKt {
    private static ImageVector _playLesson;

    public static final ImageVector getPlayLesson(Icons.Rounded rounded) {
        ImageVector imageVector = _playLesson;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayLesson", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 11.0f);
        b.curveToRelative(0.34f, 0.0f, 0.67f, 0.03f, 1.0f, 0.08f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(5.0f);
        b.curveTo(3.9f, 2.0f, 3.0f, 2.9f, 3.0f, 4.0f);
        b.verticalLineToRelative(16.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(7.26f);
        b.curveTo(11.47f, 20.87f, 11.0f, 19.49f, 11.0f, 18.0f);
        b.curveTo(11.0f, 14.13f, 14.13f, 11.0f, 18.0f, 11.0f);
        b.close();
        b.moveTo(7.76f, 10.55f);
        b.curveTo(7.42f, 10.75f, 7.0f, 10.51f, 7.0f, 10.12f);
        kf0.r(b, 4.0f, 5.0f, 6.12f);
        b.curveToRelative(0.0f, 0.39f, -0.42f, 0.63f, -0.76f, 0.43f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 9.5f, 9.5f, 7.76f, 10.55f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(18.0f, 13.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        bv.v(b2, 16.75f, 19.6f, -3.2f);
        b2.curveToRelative(0.0f, -0.39f, 0.43f, -0.63f, 0.76f, -0.42f);
        b2.lineToRelative(2.56f, 1.6f);
        b2.curveToRelative(0.31f, 0.2f, 0.31f, 0.65f, 0.0f, 0.85f);
        b2.lineToRelative(-2.56f, 1.6f);
        b2.curveTo(17.18f, 20.23f, 16.75f, 19.99f, 16.75f, 19.6f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playLesson = build;
        build.getClass();
        return build;
    }
}
