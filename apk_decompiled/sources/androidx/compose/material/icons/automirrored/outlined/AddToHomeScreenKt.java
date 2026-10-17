package androidx.compose.material.icons.automirrored.outlined;

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
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddToHomeScreenKt {
    private static ImageVector _addToHomeScreen;

    public static final ImageVector getAddToHomeScreen(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _addToHomeScreen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.AddToHomeScreen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 1.01f, 8.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k4.l(i, 3.0f, 2.0f, 5.0f, 10.0f);
        af0.s(i, 14.0f, 8.0f, -1.0f, 6.0f);
        i.verticalLineToRelative(3.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        af0.r(i, 10.0f, 15.0f, 2.0f, 8.0f);
        af0.u(i, 5.0f, 2.0f, 3.59f);
        i.lineTo(3.0f, 15.59f);
        i.lineTo(4.41f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(i, 10.0f, 11.41f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addToHomeScreen = build;
        build.getClass();
        return build;
    }
}
