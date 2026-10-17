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
import defpackage.af0;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _4kKt {
    private static ImageVector __4k;

    public static final ImageVector get_4k(Icons.Outlined outlined) {
        ImageVector imageVector = __4k;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined._4k", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 19.0f, 19.0f, 5.0f, 19.0f);
        r6.m(i, 5.0f, 5.0f, 14.0f, 14.0f);
        i.moveTo(9.5f, 15.0f);
        af0.m(i, 11.0f, 15.0f, -1.49f, 1.0f);
        i.lineTo(12.0f, 12.0f);
        i.horizontalLineToRelative(-1.0f);
        i.lineTo(11.0f, 9.0f);
        i.lineTo(9.5f, 9.0f);
        i.verticalLineToRelative(3.0f);
        i.lineTo(8.0f, 12.0f);
        i.lineTo(8.0f, 9.0f);
        kp0.x(i, 6.5f, 9.0f, 4.5f, 3.0f);
        i.moveTo(18.2f, 15.0f);
        i.lineToRelative(-2.0f, -3.0f);
        i.lineToRelative(2.0f, -3.0f);
        i.horizontalLineToRelative(-1.7f);
        fc.C(i, -2.0f, 3.0f, 2.0f, 3.0f);
        i.moveTo(14.5f, 12.0f);
        i.lineTo(14.5f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(i, 13.0f, 9.0f, 6.0f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4k = build;
        build.getClass();
        return build;
    }
}
