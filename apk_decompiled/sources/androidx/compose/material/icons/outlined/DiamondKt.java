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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DiamondKt {
    private static ImageVector _diamond;

    public static final ImageVector getDiamond(Icons.Outlined outlined) {
        ImageVector imageVector = _diamond;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Diamond", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(19.0f, 3.0f, 5.0f, 2.0f, 9.0f);
        l.lineToRelative(10.0f, 12.0f);
        r6.C(l, 22.0f, 9.0f, 19.0f, 3.0f);
        l.moveTo(9.62f, 8.0f);
        l.lineToRelative(1.5f, -3.0f);
        uf.A(l, 1.76f, 1.5f, 3.0f, 9.62f);
        l.moveTo(11.0f, 10.0f);
        l.verticalLineToRelative(6.68f);
        l.lineTo(5.44f, 10.0f);
        l.horizontalLineTo(11.0f);
        l.close();
        l.moveTo(13.0f, 10.0f);
        l.horizontalLineToRelative(5.56f);
        l.lineTo(13.0f, 16.68f);
        l.verticalLineTo(10.0f);
        l.close();
        l.moveTo(19.26f, 8.0f);
        kf0.B(l, -2.65f, -1.5f, -3.0f, 2.65f);
        uo.l(l, 19.26f, 8.0f, 6.24f, 5.0f);
        r6.t(l, 2.65f, -1.5f, 3.0f, 4.74f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(l, 6.24f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _diamond = build;
        build.getClass();
        return build;
    }
}
