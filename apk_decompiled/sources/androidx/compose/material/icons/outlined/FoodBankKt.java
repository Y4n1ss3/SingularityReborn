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
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FoodBankKt {
    private static ImageVector _foodBank;

    public static final ImageVector getFoodBank(Icons.Outlined outlined) {
        ImageVector imageVector = _foodBank;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FoodBank", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(12.0f, 5.5f, 6.0f, 4.5f, 9.0f);
        e.horizontalLineTo(6.0f);
        e.verticalLineToRelative(-9.0f);
        e.lineTo(12.0f, 5.5f);
        e.moveTo(12.0f, 3.0f);
        af0.m(e, 4.0f, 9.0f, 12.0f, 16.0f);
        e.verticalLineTo(9.0f);
        r6.C(e, 12.0f, 3.0f, 12.0f, 3.0f);
        uf.D(e, 11.5f, 9.5f, 3.0f, 11.0f);
        uf.s(e, -3.0f, -1.0f, 3.0f, 9.5f);
        kf0.z(e, -3.0f, -1.0f, 3.0f);
        e.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        kf0.z(e, 4.0f, 1.0f, -4.0f);
        e.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        kf0.n(e, -3.0f, 11.5f, 13.0f, 11.5f);
        k4.l(e, 3.0f, 1.0f, 18.0f, 1.0f);
        e.verticalLineTo(9.5f);
        e.curveTo(13.9f, 9.5f, 13.0f, 10.4f, 13.0f, 11.5f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _foodBank = build;
        build.getClass();
        return build;
    }
}
