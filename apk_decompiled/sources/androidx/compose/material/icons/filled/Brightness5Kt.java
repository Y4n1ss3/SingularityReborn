package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness5Kt {
    private static ImageVector _brightness5;

    public static final ImageVector getBrightness5(Icons.Filled filled) {
        ImageVector imageVector = _brightness5;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Brightness5", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 15.31f, 23.31f, 12.0f);
        fc.t(i, 20.0f, 8.69f, 4.0f, -4.69f);
        i.lineTo(12.0f, 0.69f);
        r6.w(i, 8.69f, 4.0f, 4.0f, 4.69f);
        i.lineTo(0.69f, 12.0f);
        fc.t(i, 4.0f, 15.31f, 20.0f, 4.69f);
        i.lineTo(12.0f, 23.31f);
        i.lineTo(15.31f, 20.0f);
        i.horizontalLineTo(20.0f);
        i.verticalLineToRelative(-4.69f);
        i.close();
        i.moveTo(12.0f, 18.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        i.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        i.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness5 = build;
        build.getClass();
        return build;
    }
}
