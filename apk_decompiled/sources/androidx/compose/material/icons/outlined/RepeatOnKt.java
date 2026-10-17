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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RepeatOnKt {
    private static ImageVector _repeatOn;

    public static final ImageVector getRepeatOn(Icons.Outlined outlined) {
        ImageVector imageVector = _repeatOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RepeatOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(21.0f, 1.0f, 3.0f);
        d.curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f);
        d.verticalLineToRelative(18.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(3.0f);
        d.curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f);
        r6.g(d, 19.0f, 19.0f, 6.83f);
        d.lineToRelative(1.58f, 1.58f);
        d.lineTo(7.0f, 22.0f);
        d.lineToRelative(-4.0f, -4.0f);
        d.lineToRelative(4.0f, -4.0f);
        d.lineToRelative(1.41f, 1.42f);
        r6.w(d, 6.83f, 17.0f, 17.0f, -4.0f);
        uo.r(d, 2.0f, 19.0f, 17.0f, 10.0f);
        d.lineToRelative(-1.41f, -1.42f);
        r6.w(d, 17.17f, 7.0f, 7.0f, 4.0f);
        uf.t(d, 5.0f, 5.0f, 12.17f);
        d.lineToRelative(-1.58f, -1.58f);
        d.lineTo(17.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 4.0f, 4.0f, 17.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repeatOn = build;
        build.getClass();
        return build;
    }
}
