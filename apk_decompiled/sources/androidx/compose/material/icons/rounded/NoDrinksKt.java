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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoDrinksKt {
    private static ImageVector _noDrinks;

    public static final ImageVector getNoDrinks(Icons.Rounded rounded) {
        ImageVector imageVector = _noDrinks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoDrinks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.49f, 20.49f, 3.51f, 3.51f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(7.54f, 7.54f);
        kf0.u(i, 11.0f, 14.0f, 5.0f, 7.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(0.32f, 0.0f, 0.59f, -0.16f, 0.78f, -0.4f);
        i.lineToRelative(1.3f, 1.3f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        bv.v(i, 13.0f, 19.0f, -3.17f);
        kf0.h(i, 16.17f, 19.0f, 13.0f);
        i.moveTo(7.83f, 5.0f);
        i.lineToRelative(-2.0f, -2.0f);
        i.horizontalLineToRelative(13.72f);
        i.curveTo(20.35f, 3.0f, 21.0f, 3.65f, 21.0f, 4.45f);
        i.curveToRelative(0.0f, 0.35f, -0.13f, 0.7f, -0.37f, 0.96f);
        i.lineToRelative(-5.83f, 6.56f);
        i.lineTo(9.83f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(i, 6.74f, 1.78f, -2.0f, 7.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noDrinks = build;
        build.getClass();
        return build;
    }
}
