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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _4kPlusKt {
    private static ImageVector __4kPlus;

    public static final ImageVector get_4kPlus(Icons.Filled filled) {
        ImageVector imageVector = __4kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._4kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.l(i, 10.5f, 13.5f, -1.0f);
        i.lineTo(9.5f, 15.0f);
        i.lineTo(8.0f, 15.0f);
        i.verticalLineToRelative(-1.5f);
        i.lineTo(5.0f, 13.5f);
        fc.w(i, 5.0f, 9.0f, 1.5f, 3.0f);
        i.lineTo(8.0f, 12.0f);
        fc.w(i, 8.0f, 9.0f, 1.5f, 3.0f);
        fc.x(i, 1.0f, 1.5f, 16.0f, 15.0f);
        i.horizontalLineToRelative(-1.75f);
        i.lineToRelative(-1.75f, -2.25f);
        i.lineTo(12.5f, 15.0f);
        i.lineTo(11.0f, 15.0f);
        fc.w(i, 11.0f, 9.0f, 1.5f, 2.25f);
        i.lineTo(14.25f, 9.0f);
        i.lineTo(16.0f, 9.0f);
        gy.B(i, -2.25f, 3.0f, 16.0f, 15.0f);
        i.moveTo(20.0f, 12.5f);
        uo.n(i, -1.5f, 18.5f, 14.0f, -1.0f);
        bv.q(i, -1.5f, 16.0f, 12.5f, -1.0f);
        uo.n(i, 1.5f, 17.5f, 10.0f, 1.0f);
        i.verticalLineToRelative(1.5f);
        i.lineTo(20.0f, 11.5f);
        i.verticalLineToRelative(1.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4kPlus = build;
        build.getClass();
        return build;
    }
}
