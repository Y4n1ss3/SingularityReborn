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
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalPizzaKt {
    private static ImageVector _localPizza;

    public static final ImageVector getLocalPizza(Icons.Outlined outlined) {
        ImageVector imageVector = _localPizza;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalPizza", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.43f, 2.0f, 5.23f, 3.54f, 3.01f, 6.0f);
        b.lineTo(12.0f, 22.0f);
        b.lineToRelative(8.99f, -16.0f);
        b.curveTo(18.78f, 3.55f, 15.57f, 2.0f, 12.0f, 2.0f);
        k4.r(b, 12.0f, 17.92f, 5.51f, 6.36f);
        b.curveTo(7.32f, 4.85f, 9.62f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveToRelative(4.68f, 0.85f, 6.49f, 2.36f);
        uo.l(b, 12.0f, 17.92f, 9.0f, 5.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveTo(8.17f, 8.5f, 9.0f, 8.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveTo(9.82f, 5.5f, 9.0f, 5.5f);
        b.close();
        b.moveTo(10.5f, 13.0f);
        b.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.68f, -1.5f, -1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.5f, 0.67f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPizza = build;
        build.getClass();
        return build;
    }
}
