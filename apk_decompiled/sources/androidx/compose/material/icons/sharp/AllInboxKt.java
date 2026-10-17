package androidx.compose.material.icons.sharp;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AllInboxKt {
    private static ImageVector _allInbox;

    public static final ImageVector getAllInbox(Icons.Sharp sharp) {
        ImageVector imageVector = _allInbox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AllInbox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.0f, 3.0f, 3.0f, 3.0f, 11.0f);
        gy.n(s, 18.0f, 21.0f, 3.0f);
        s.moveTo(19.0f, 9.0f);
        s.horizontalLineToRelative(-4.0f);
        s.curveToRelative(0.0f, 1.62f, -1.38f, 3.0f, -3.0f, 3.0f);
        s.reflectiveCurveToRelative(-3.0f, -1.38f, -3.0f, -3.0f);
        s.lineTo(5.0f, 9.0f);
        r6.m(s, 5.0f, 5.0f, 14.0f, 4.0f);
        k4.C(s, 15.0f, 16.0f, 6.0f, 5.0f);
        af0.m(s, 3.0f, 21.0f, -5.0f, 6.0f);
        s.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(s, 3.0f, -1.34f, 3.0f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInbox = build;
        build.getClass();
        return build;
    }
}
