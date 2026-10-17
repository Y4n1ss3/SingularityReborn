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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpellcheckKt {
    private static ImageVector _spellcheck;

    public static final ImageVector getSpellcheck(Icons.TwoTone twoTone) {
        ImageVector imageVector = _spellcheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Spellcheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(12.45f, 16.0f, 2.09f, 9.43f, 3.0f);
        p.lineTo(7.57f, 3.0f);
        p.lineTo(2.46f, 16.0f);
        kf0.B(p, 2.09f, 1.12f, -3.0f, 5.64f);
        fc.B(p, 1.14f, 3.0f, 6.43f, 11.0f);
        p.lineTo(8.5f, 5.48f);
        r6.C(p, 10.57f, 11.0f, 6.43f, 11.0f);
        p.moveTo(21.59f, 11.59f);
        p.lineToRelative(-8.09f, 8.09f);
        p.lineTo(9.83f, 16.0f);
        p.lineToRelative(-1.41f, 1.41f);
        p.lineToRelative(5.09f, 5.09f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(p, 23.0f, 13.0f, -1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spellcheck = build;
        build.getClass();
        return build;
    }
}
