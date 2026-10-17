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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SchoolKt {
    private static ImageVector _school;

    public static final ImageVector getSchool(Icons.Rounded rounded) {
        ImageVector imageVector = _school;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.School", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(5.0f, 13.18f, 2.81f);
        h.curveToRelative(0.0f, 0.73f, 0.4f, 1.41f, 1.04f, 1.76f);
        h.lineToRelative(5.0f, 2.73f);
        h.curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0.0f);
        h.lineToRelative(5.0f, -2.73f);
        h.curveToRelative(0.64f, -0.35f, 1.04f, -1.03f, 1.04f, -1.76f);
        h.verticalLineToRelative(-2.81f);
        h.lineToRelative(-6.04f, 3.3f);
        h.curveToRelative(-0.6f, 0.33f, -1.32f, 0.33f, -1.92f, 0.0f);
        uo.l(h, 5.0f, 13.18f, 11.04f, 3.52f);
        h.lineToRelative(-8.43f, 4.6f);
        h.curveToRelative(-0.69f, 0.38f, -0.69f, 1.38f, 0.0f, 1.76f);
        h.lineToRelative(8.43f, 4.6f);
        h.curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0.0f);
        h.lineTo(21.0f, 10.09f);
        h.lineTo(21.0f, 16.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        h.lineTo(23.0f, 9.59f);
        h.curveToRelative(0.0f, -0.37f, -0.2f, -0.7f, -0.52f, -0.88f);
        h.lineToRelative(-9.52f, -5.19f);
        h.curveToRelative(-0.6f, -0.32f, -1.32f, -0.32f, -1.92f, 0.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _school = build;
        build.getClass();
        return build;
    }
}
