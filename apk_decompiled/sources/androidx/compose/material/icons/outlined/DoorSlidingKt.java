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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoorSlidingKt {
    private static ImageVector _doorSliding;

    public static final ImageVector getDoorSliding(Icons.Outlined outlined) {
        ImageVector imageVector = _doorSliding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoorSliding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(10.0f, 13.0f, 8.0f, -2.0f, 2.0f);
        k4.D(i, 13.0f, 16.0f, 11.0f, -2.0f);
        k4.p(i, 2.0f, 2.0f, 11.0f);
        uf.D(i, 21.0f, 19.0f, 2.0f, 3.0f);
        bv.x(i, -2.0f, 1.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        kf0.n(i, 14.0f, 21.0f, 11.0f, 5.0f);
        bv.h(i, 6.0f, 14.0f, 5.0f, 5.0f);
        k4.C(i, 18.0f, 5.0f, -5.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doorSliding = build;
        build.getClass();
        return build;
    }
}
