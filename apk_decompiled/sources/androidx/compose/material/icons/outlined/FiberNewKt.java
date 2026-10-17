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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.Outlined outlined) {
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FiberNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.25f, 12.5f, 4.75f, 9.0f);
        af0.m(i, 3.5f, 9.0f, 6.0f, 1.25f);
        uo.k(i, -3.5f, 7.3f, 15.0f, 1.2f);
        r6.C(i, 8.5f, 9.0f, 7.25f, 9.0f);
        k4.C(i, 9.5f, 15.0f, 4.0f, -1.25f);
        af0.m(i, 11.0f, 13.75f, -1.11f, 2.5f);
        bv.q(i, -1.26f, 11.0f, 11.38f, -1.12f);
        uf.C(i, 2.5f, 13.5f, 9.0f, -4.0f);
        bv.y(i, 19.25f, 9.0f, 4.5f, -1.12f);
        fc.w(i, 18.13f, 9.99f, -1.25f, 3.52f);
        i.horizontalLineToRelative(-1.13f);
        i.lineTo(15.75f, 9.0f);
        i.lineTo(14.5f, 9.0f);
        i.verticalLineToRelative(5.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(4.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.h(i, 20.5f, 9.0f, -1.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = build;
        build.getClass();
        return build;
    }
}
