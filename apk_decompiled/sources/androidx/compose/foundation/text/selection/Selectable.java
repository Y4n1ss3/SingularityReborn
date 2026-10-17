package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Selectable {
    void appendSelectableInfoToBuilder(SelectionLayoutBuilder selectionLayoutBuilder);

    Rect getBoundingBox(int i);

    float getCenterYForOffset(int i);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo1483getHandlePositiondBAh8RU(Selection selection, boolean z);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    float getLineHeight(int i);

    float getLineLeft(int i);

    float getLineRight(int i);

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo1484getRangeOfLineContainingjx7JFs(int i);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();

    TextLayoutResult textLayoutResult();
}
