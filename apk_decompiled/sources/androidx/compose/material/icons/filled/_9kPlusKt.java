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
public final class _9kPlusKt {
    private static ImageVector __9kPlus;

    public static final ImageVector get_9kPlus(Icons.Filled filled) {
        ImageVector imageVector = __9kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._9kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(6.5f, 10.0f, 8.0f, 10.0f, 1.5f);
        uo.l(s, 6.5f, 11.5f, 19.0f, 3.0f);
        s.lineTo(5.0f, 3.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.verticalLineToRelative(14.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(21.0f, 5.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.close();
        s.moveTo(9.5f, 14.0f);
        s.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        af0.m(s, 5.0f, 15.0f, -1.5f, 3.0f);
        s.verticalLineToRelative(-1.0f);
        s.lineTo(6.0f, 12.5f);
        s.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        s.lineTo(5.0f, 10.0f);
        s.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        s.horizontalLineToRelative(2.5f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.m(s, 4.0f, 16.0f, 15.0f, -1.75f);
        s.lineToRelative(-1.75f, -2.25f);
        s.lineTo(12.5f, 15.0f);
        s.lineTo(11.0f, 15.0f);
        fc.w(s, 11.0f, 9.0f, 1.5f, 2.25f);
        s.lineTo(14.25f, 9.0f);
        s.lineTo(16.0f, 9.0f);
        gy.B(s, -2.25f, 3.0f, 16.0f, 15.0f);
        s.moveTo(20.0f, 12.5f);
        uo.n(s, -1.5f, 18.5f, 14.0f, -1.0f);
        bv.q(s, -1.5f, 16.0f, 12.5f, -1.0f);
        uo.n(s, 1.5f, 17.5f, 10.0f, 1.0f);
        s.verticalLineToRelative(1.5f);
        s.lineTo(20.0f, 11.5f);
        s.verticalLineToRelative(1.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __9kPlus = build;
        build.getClass();
        return build;
    }
}
