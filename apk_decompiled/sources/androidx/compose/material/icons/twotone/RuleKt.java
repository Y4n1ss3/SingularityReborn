package androidx.compose.material.icons.twotone;

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
import defpackage.er;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RuleKt {
    private static ImageVector _rule;

    public static final ImageVector getRule(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rule;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Rule", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.54f, 11.0f, 13.0f, 7.46f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(2.12f, 2.12f);
        i.lineToRelative(4.24f, -4.24f);
        gy.B(i, 1.41f, 1.41f, 16.54f, 11.0f);
        k4.A(i, 11.0f, 7.0f, 2.0f, 2.0f);
        uo.r(i, 9.0f, 7.0f, 21.0f, 13.41f);
        i.lineTo(19.59f, 12.0f);
        i.lineTo(17.0f, 14.59f);
        i.lineTo(14.41f, 12.0f);
        i.lineTo(13.0f, 13.41f);
        i.lineTo(15.59f, 16.0f);
        i.lineTo(13.0f, 18.59f);
        i.lineTo(14.41f, 20.0f);
        i.lineTo(17.0f, 17.41f);
        i.lineTo(19.59f, 20.0f);
        i.lineTo(21.0f, 18.59f);
        r6.C(i, 18.41f, 16.0f, 21.0f, 13.41f);
        k4.A(i, 11.0f, 15.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 9.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rule = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getRule$annotations(Icons.TwoTone twoTone) {
    }
}
