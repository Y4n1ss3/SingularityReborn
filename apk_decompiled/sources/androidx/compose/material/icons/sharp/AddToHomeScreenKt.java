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
import defpackage.er;
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddToHomeScreenKt {
    private static ImageVector _addToHomeScreen;

    public static final ImageVector getAddToHomeScreen(Icons.Sharp sharp) {
        ImageVector imageVector = _addToHomeScreen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddToHomeScreen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(20.0f, 1.01f, 6.0f, 1.0f, 5.0f);
        af0.q(s, 2.0f, 5.0f, 10.0f, 14.0f);
        af0.o(s, 8.0f, -1.0f, 6.0f, 5.0f);
        uo.r(s, 14.0f, 1.01f, 10.0f, 15.0f);
        af0.p(s, 2.0f, 8.0f, 5.0f, 2.0f);
        s.horizontalLineToRelative(3.59f);
        s.lineTo(3.0f, 15.59f);
        s.lineTo(4.41f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(s, 10.0f, 11.41f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addToHomeScreen = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getAddToHomeScreen$annotations(Icons.Sharp sharp) {
    }
}
