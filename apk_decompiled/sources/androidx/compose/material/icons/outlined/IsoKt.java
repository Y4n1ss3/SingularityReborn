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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IsoKt {
    private static ImageVector _iso;

    public static final ImageVector getIso(Icons.Outlined outlined) {
        ImageVector imageVector = _iso;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Iso", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        r6.B(i, 5.5f, 7.5f, 2.0f, -2.0f);
        af0.m(i, 9.0f, 5.5f, 2.0f, 2.0f);
        i.lineTo(11.0f, 9.0f);
        i.lineTo(9.0f, 9.0f);
        i.verticalLineToRelative(2.0f);
        i.lineTo(7.5f, 11.0f);
        i.lineTo(7.5f, 9.0f);
        gy.n(i, -2.0f, 5.5f, 7.5f);
        i.moveTo(19.0f, 19.0f);
        i.lineTo(5.0f, 19.0f);
        bv.r(i, 19.0f, 5.0f, 14.0f);
        bv.y(i, 17.0f, 17.0f, -1.5f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(i, 12.0f, 17.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iso = build;
        build.getClass();
        return build;
    }
}
