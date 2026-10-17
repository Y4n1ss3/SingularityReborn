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
import defpackage.bv;
import defpackage.er;
import defpackage.fc;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardTabKt {
    private static ImageVector _keyboardTab;

    public static final ImageVector getKeyboardTab(Icons.Filled filled) {
        ImageVector imageVector = _keyboardTab;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.KeyboardTab", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(11.59f, 7.41f, 15.17f, 11.0f, 1.0f);
        gy.C(p, 2.0f, 14.17f, -3.59f, 3.59f);
        p.lineTo(13.0f, 18.0f);
        p.lineToRelative(6.0f, -6.0f);
        fc.C(p, -6.0f, -6.0f, -1.41f, 1.41f);
        bv.y(p, 20.0f, 6.0f, 12.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.l(p, 6.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyboardTab = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getKeyboardTab$annotations(Icons.Filled filled) {
    }
}
