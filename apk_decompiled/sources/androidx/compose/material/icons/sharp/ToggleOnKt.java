package androidx.compose.material.icons.sharp;

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
public final class ToggleOnKt {
    private static ImageVector _toggleOn;

    public static final ImageVector getToggleOn(Icons.Sharp sharp) {
        ImageVector imageVector = _toggleOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ToggleOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 7.0f, 7.0f, 7.0f);
        i.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        i.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        i.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        i.close();
        i.moveTo(17.0f, 15.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toggleOn = build;
        build.getClass();
        return build;
    }
}
