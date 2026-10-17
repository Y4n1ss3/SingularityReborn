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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExitToAppKt {
    private static ImageVector _exitToApp;

    public static final ImageVector getExitToApp(Icons.Sharp sharp) {
        ImageVector imageVector = _exitToApp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ExitToApp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.09f, 15.59f, 11.5f, 17.0f);
        i.lineToRelative(5.0f, -5.0f);
        i.lineToRelative(-5.0f, -5.0f);
        i.lineToRelative(-1.41f, 1.41f);
        r6.w(i, 12.67f, 11.0f, 3.0f, 2.0f);
        uo.w(i, 9.67f, -2.58f, 2.59f);
        k4.A(i, 21.0f, 3.0f, 3.0f, 6.0f);
        af0.q(i, 2.0f, 5.0f, 14.0f, 14.0f);
        af0.o(i, 5.0f, -4.0f, 3.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 18.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exitToApp = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getExitToApp$annotations(Icons.Sharp sharp) {
    }
}
