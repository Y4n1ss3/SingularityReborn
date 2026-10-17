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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RuleFolderKt {
    private static ImageVector _ruleFolder;

    public static final ImageVector getRuleFolder(Icons.Sharp sharp) {
        ImageVector imageVector = _ruleFolder;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RuleFolder", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(22.0f, 6.0f, 12.0f, -2.0f, -2.0f);
        bv.h(a, 2.0f, 16.0f, 20.0f, 6.0f);
        a.moveTo(7.83f, 16.0f);
        a.lineTo(5.0f, 13.17f);
        a.lineToRelative(1.41f, -1.41f);
        a.lineToRelative(1.41f, 1.41f);
        a.lineToRelative(3.54f, -3.54f);
        gy.B(a, 1.41f, 1.41f, 7.83f, 16.0f);
        a.moveTo(17.41f, 13.0f);
        a.lineTo(19.0f, 14.59f);
        a.lineTo(17.59f, 16.0f);
        a.lineTo(16.0f, 14.41f);
        a.lineTo(14.41f, 16.0f);
        a.lineTo(13.0f, 14.59f);
        a.lineTo(14.59f, 13.0f);
        a.lineTo(13.0f, 11.41f);
        a.lineTo(14.41f, 10.0f);
        a.lineTo(16.0f, 11.59f);
        a.lineTo(17.59f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(a, 19.0f, 11.41f, 17.41f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ruleFolder = build;
        build.getClass();
        return build;
    }
}
