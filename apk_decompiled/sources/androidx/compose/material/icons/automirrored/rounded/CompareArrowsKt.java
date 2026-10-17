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
import defpackage.af0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompareArrowsKt {
    private static ImageVector _compareArrows;

    public static final ImageVector getCompareArrows(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _compareArrows;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.CompareArrows", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(9.01f, 14.0f, 3.0f, 14.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(6.01f);
        i.verticalLineToRelative(1.79f);
        i.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        i.lineToRelative(2.78f, -2.79f);
        i.curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, 0.0f, -0.71f);
        i.lineToRelative(-2.78f, -2.79f);
        i.curveToRelative(-0.31f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f);
        uo.l(i, 9.01f, 14.0f, 14.99f, 11.79f);
        i.lineTo(14.99f, 10.0f);
        i.lineTo(21.0f, 10.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-6.01f);
        i.lineTo(14.99f, 6.21f);
        i.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        i.lineToRelative(-2.78f, 2.79f);
        i.curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f);
        i.lineToRelative(2.78f, 2.79f);
        i.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compareArrows = build;
        build.getClass();
        return build;
    }
}
