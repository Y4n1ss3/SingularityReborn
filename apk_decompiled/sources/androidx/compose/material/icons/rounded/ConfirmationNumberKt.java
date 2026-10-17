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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConfirmationNumberKt {
    private static ImageVector _confirmationNumber;

    public static final ImageVector getConfirmationNumber(Icons.Rounded rounded) {
        ImageVector imageVector = _confirmationNumber;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConfirmationNumber", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 8.54f, 22.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.lineTo(4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        i.verticalLineToRelative(2.54f);
        i.curveToRelative(0.0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f);
        i.curveTo(3.58f, 10.58f, 4.0f, 11.24f, 4.0f, 12.0f);
        i.reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f);
        i.curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineToRelative(-2.54f);
        i.curveToRelative(0.0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f);
        i.curveToRelative(-0.63f, -0.34f, -1.06f, -1.0f, -1.06f, -1.76f);
        i.reflectiveCurveToRelative(0.43f, -1.42f, 1.06f, -1.76f);
        i.curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f);
        r6.B(i, 13.0f, 17.5f, -2.0f, -2.0f);
        fc.x(i, 2.0f, 2.0f, 13.0f, 13.0f);
        gy.D(i, -2.0f, -2.0f, 2.0f, 2.0f);
        k4.C(i, 13.0f, 8.5f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(i, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _confirmationNumber = build;
        build.getClass();
        return build;
    }
}
