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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BackspaceKt {
    private static ImageVector _backspace;

    public static final ImageVector getBackspace(Icons.Sharp sharp) {
        ImageVector imageVector = _backspace;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Backspace", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(24.0f, 3.0f, 6.0f, 3.0f);
        i.lineToRelative(-6.0f, 9.0f);
        i.lineToRelative(6.0f, 9.0f);
        gy.n(i, 18.0f, 24.0f, 3.0f);
        i.moveTo(19.0f, 15.59f);
        i.lineTo(17.59f, 17.0f);
        i.lineTo(14.0f, 13.41f);
        i.lineTo(10.41f, 17.0f);
        i.lineTo(9.0f, 15.59f);
        i.lineTo(12.59f, 12.0f);
        i.lineTo(9.0f, 8.41f);
        i.lineTo(10.41f, 7.0f);
        i.lineTo(14.0f, 10.59f);
        i.lineTo(17.59f, 7.0f);
        i.lineTo(19.0f, 8.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 15.41f, 12.0f, 19.0f, 15.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backspace = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getBackspace$annotations(Icons.Sharp sharp) {
    }
}
