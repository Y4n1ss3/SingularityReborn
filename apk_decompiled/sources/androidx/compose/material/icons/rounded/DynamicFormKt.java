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
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DynamicFormKt {
    private static ImageVector _dynamicForm;

    public static final ImageVector getDynamicForm(Icons.Rounded rounded) {
        ImageVector imageVector = _dynamicForm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DynamicForm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.68f, 9.71f, -3.72f, 8.19f);
        e.curveTo(17.73f, 18.39f, 17.0f, 18.23f, 17.0f, 17.69f);
        e.verticalLineTo(11.0f);
        e.horizontalLineToRelative(-1.5f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        e.verticalLineToRelative(-6.0f);
        e.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        e.horizontalLineToRelative(5.76f);
        e.curveToRelative(0.35f, 0.0f, 0.6f, 0.36f, 0.46f, 0.69f);
        e.lineTo(20.0f, 9.0f);
        e.horizontalLineToRelative(1.22f);
        e.curveTo(21.59f, 9.0f, 21.83f, 9.38f, 21.68f, 9.71f);
        af0.A(e, 15.0f, 13.0f, 7.0f, 4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineToRelative(-3.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        k4.w(e, 15.0f, 6.25f, 16.5f);
        e.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        e.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        e.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        e.reflectiveCurveTo(6.25f, 16.91f, 6.25f, 16.5f);
        af0.A(e, 13.0f, 4.0f, 7.0f, 4.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineTo(6.0f);
        e.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        k4.w(e, 13.0f, 6.25f, 7.5f);
        e.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        e.reflectiveCurveTo(4.75f, 7.09f, 4.75f, 7.5f);
        e.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(e, 6.25f, 7.91f, 6.25f, 7.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dynamicForm = build;
        build.getClass();
        return build;
    }
}
