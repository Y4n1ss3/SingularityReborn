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
import defpackage.er;
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InsertDriveFileKt {
    private static ImageVector _insertDriveFile;

    public static final ImageVector getInsertDriveFile(Icons.Filled filled) {
        ImageVector imageVector = _insertDriveFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.InsertDriveFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 2.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        b.lineTo(4.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        b.lineTo(18.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(20.0f, 8.0f);
        gy.B(b, -6.0f, -6.0f, 6.0f, 2.0f);
        b.moveTo(13.0f, 9.0f);
        b.lineTo(13.0f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 18.5f, 9.0f, 13.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertDriveFile = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getInsertDriveFile$annotations(Icons.Filled filled) {
    }
}
