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
import defpackage.bv;
import defpackage.er;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GradingKt {
    private static ImageVector _grading;

    public static final ImageVector getGrading(Icons.TwoTone twoTone) {
        ImageVector imageVector = _grading;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Grading", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(4.0f, 7.0f, 16.0f, 2.0f, 4.0f);
        k4.D(d, 7.0f, 4.0f, 13.0f, 16.0f);
        gy.s(d, -2.0f, 4.0f, 13.0f);
        k4.C(d, 4.0f, 17.0f, 7.0f, -2.0f);
        bv.s(d, 4.0f, 17.0f, 4.0f, 21.0f);
        gy.t(d, 7.0f, -2.0f, 4.0f, 21.0f);
        d.moveTo(15.41f, 18.17f);
        d.lineTo(14.0f, 16.75f);
        d.lineToRelative(-1.41f, 1.41f);
        d.lineTo(15.41f, 21.0f);
        d.lineTo(20.0f, 16.42f);
        r6.C(d, 18.58f, 15.0f, 15.41f, 18.17f);
        bv.y(d, 4.0f, 3.0f, 2.0f, 16.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(d, 3.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grading = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getGrading$annotations(Icons.TwoTone twoTone) {
    }
}
