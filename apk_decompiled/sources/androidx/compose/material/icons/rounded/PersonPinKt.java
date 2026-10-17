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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonPinKt {
    private static ImageVector _personPin;

    public static final ImageVector getPersonPin(Icons.Rounded rounded) {
        ImageVector imageVector = _personPin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PersonPin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 2.0f, 5.0f, 2.0f);
        i.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(4.0f);
        i.lineToRelative(2.29f, 2.29f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineTo(15.0f, 20.0f);
        i.horizontalLineToRelative(4.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(12.0f, 5.3f);
        i.curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        i.reflectiveCurveToRelative(-1.21f, 2.7f, -2.7f, 2.7f);
        i.reflectiveCurveTo(9.3f, 9.49f, 9.3f, 8.0f);
        i.reflectiveCurveToRelative(1.21f, -2.7f, 2.7f, -2.7f);
        k4.r(i, 18.0f, 16.0f, 6.0f, 16.0f);
        i.verticalLineToRelative(-0.9f);
        i.curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f);
        i.reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, 0.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personPin = build;
        build.getClass();
        return build;
    }
}
