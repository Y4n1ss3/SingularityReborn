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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlayLessonKt {
    private static ImageVector _playLesson;

    public static final ImageVector getPlayLesson(Icons.Outlined outlined) {
        ImageVector imageVector = _playLesson;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PlayLesson", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(5.0f, 20.0f, 4.0f, 2.0f, 7.0f);
        c.lineToRelative(2.5f, -1.5f);
        fc.t(c, 12.0f, 11.0f, 4.0f, 5.0f);
        c.verticalLineToRelative(7.08f);
        c.curveToRelative(0.33f, -0.05f, 0.66f, -0.08f, 1.0f, -0.08f);
        c.reflectiveCurveToRelative(0.67f, 0.03f, 1.0f, 0.08f);
        c.verticalLineTo(4.0f);
        c.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c.horizontalLineTo(5.0f);
        c.curveTo(3.9f, 2.0f, 3.0f, 2.9f, 3.0f, 4.0f);
        c.verticalLineToRelative(16.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(7.26f);
        c.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        k4.w(c, 5.0f, 18.0f, 13.0f);
        c.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        c.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        c.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        c.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        bv.v(c, 16.75f, 20.5f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(c, 4.0f, 2.5f, 16.75f, 20.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playLesson = build;
        build.getClass();
        return build;
    }
}
